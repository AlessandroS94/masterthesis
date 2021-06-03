from flask import Flask, request, make_response, jsonify

app = Flask(__name__)


@app.route('/')
def hello_world():
    return 'BACKAND SIMULATOR'


@app.route("/json", methods=["GET"])
def json_example():
    response_body = {
        "recommending": "uni"
    }

    res = make_response(jsonify(response_body), 200)

    return res

@app.route("/Pom", methods=['POST'])
def getPom():
    
    pomFile = request.json
    print(pomFile)
    response_body = {
        "operation": "success"
    }
    res = make_response(jsonify(response_body), 200)

    return res

if __name__ == '__main__':
    app.run()
