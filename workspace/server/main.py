# coding=utf-8
# This is a sample Python script.

# Press ⌃R to execute it or replace it with your code.
# Press Double ⇧ to search everywhere for classes, files, tool windows, actions, and settings.

from flask import Flask
from flask import request
import pandas as pd
from flask import jsonify
import os

from surprise import Reader, Dataset

app = Flask(__name__)




def recommendJ(libList):
    #PREPARE DATAST
    lista = []
    [lista.append(["query", lib, 1]) for lib in libList]
    df = pd.read_csv('result.csv', sep=",")
    queryDF = pd.DataFrame(lista,columns=['ProjectID', 'LibID', 'rating'])
    # queryDF = pd.DataFrame(
    #     [["query", "com.tectonica:jonix-json", 1],
    #      ["query", "org.slf4j:slf4j-api", 1],
    #      ["query", "com.tectonica:jonix-code gen", 1],
    #      ["query", "com.fasterxml.jackson.core:jackson-databind", 1],
    #      ["query", "com.tectonica:jonix-common", 1],
    #      ["query", "org.jsoup:jsoup", 1],
    #      # ["query","com.tectonica:jonix",1],
    #      ["query", "com.tectonica:jonix-onix3", 1],
    #      ["query", "com.tectonica:jonix-parent", 1],
    #      ["query", "com.tectonica:jonix-onix2", 1],
    #      ["query", "com.tectonica:jonix-xml", 1],
    #      # ["query","junit:junit",1],
    #      ["query", "org.slf4j:slf4j-jdk14", 1]]
    #     , columns=['ProjectID', 'LibID', 'rating'])
    df = df.append(queryDF, ignore_index=True)
    reader = Reader(rating_scale=(0, 1))
    data = Dataset.load_from_df(df[['ProjectID', 'LibID', 'rating']], reader)
    #CONFIGURATION
    is_user_based = False
    neighborhood = 40
    sim_settings = {'name': 'cosine',
                    'user_based': False
                    }
    from surprise import KNNWithMeans
    algo = KNNWithMeans(k=neighborhood, sim_options=sim_settings)
    k = 10
    #TRAIN
    trainset = data.build_full_trainset()
    algo.fit(trainset)
    list_ird = [trainset.to_raw_iid(key) for key in trainset.ir.keys()]
    result = {}
    for elem in list_ird:
        k = algo.predict(uid="query", iid=elem)
        result[elem] = k.est
    sorted_result = {k: v for k, v in sorted(result.items(), key=lambda item: item[1], reverse=True)}

    return list(sorted_result.keys())[ : 10]

@app.route("/recommend", methods=['POST'])
def recommend():
    json_data = request.get_json()
    try:
        res = recommendJ(json_data['lib'])
        message = {
            'status': 200,
            'message': 'OK',
            'score' : res
        }
        return jsonify(message)
    except Exception:
        message = {
            'status': 500,
            'message': 'KO'
        }
        return message

if __name__ == '__main__':
    app.debug = True
    port = int(os.environ.get("PORT", 5000))
    app.run(host='0.0.0.0', port=port)