Here, a simple curl command to test the server


```sh
curl -XPOST -H "Content-type: application/json" -d '{
    "lib": [
        "com.tectonica:jonix-json", 
        "org.slf4j:slf4j-api", 
        "com.tectonica:jonix-code gen", 
        "com.fasterxml.jackson.core:jackson-databind", 
        "com.tectonica:jonix-common", 
        "org.jsoup:jsoup", 
        "com.tectonica:jonix-onix3", 
        "com.tectonica:jonix-parent", 
        "com.tectonica:jonix-onix2", 
        "com.tectonica:jonix-xml", 
        "org.slf4j:slf4j-jdk14"
    ]
}' 'http://localhost:5000/recommend'
```

***PS:*** We included a small dataset to test the recommender.
