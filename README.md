# kotlin-spring-cloud-function-example
Kotlin spring cloud function example with different types of creation function, supplier and consumer.
There are also examples with flux - reactive type.

## Download

```bash
    git clone git@github.com:wojciech-zurek/kotlin-spring-cloud-function-example.git
```

## Run with gradle

```bash
    cd kotlin-spring-cloud-function-example/
    ./gradlew bootRun
```

## Run as jar file

```bash
    cd kotlin-spring-cloud-function-example/
    ./gradlew bootJar
    java -jar build/libs/kotlin-spring-cloud-function-example-0.0.1-SNAPSHOT.jar
```


## HTTP Endpoints example

#### /upperCase (bean, function)

```bash
    echo "Hello World" | http POST :8080/upperCase
    HTTP/1.1 200 OK
    Content-Length: 12
    Content-Type: application/json;charset=UTF-8
    accept-encoding: gzip, deflate
    connection: keep-alive
    user-agent: HTTPie/1.0.3
    
    HELLO WORLD
```

#### /lowerCase (bean, function with reactive flux)

```bash
    echo "Hello World" | http POST :8080/lowerCase
    HTTP/1.1 200 OK
    Content-Length: 17
    Content-Type: application/json;charset=UTF-8
    accept-encoding: gzip, deflate
    connection: keep-alive
    user-agent: HTTPie/1.0.3
    
    [
        "hello world\n"
    ]
```

#### /user (function with reactive flux)

```bash
    http POST :8080/user name=admin age=30
    HTTP/1.1 200 OK
    Content-Length: 34
    Content-Type: application/json;charset=UTF-8
    accept-encoding: gzip, deflate
    connection: keep-alive
    user-agent: HTTPie/1.0.3
    
    [
        {
            "age": 30,
            "id": 0,
            "name": "admin"
        }
    ]
```

#### /log (consumer)

```bash
    echo "Message to log" | http POST :8080/log
    HTTP/1.1 200 OK
    content-length: 0
```

#### /reverse (function with reactive flux)

```bash
    echo "Message to reverse" | http POST :8080/reverse
    HTTP/1.1 200 OK
    Content-Length: 24
    Content-Type: application/json;charset=UTF-8
    accept-encoding: gzip, deflate
    connection: keep-alive
    user-agent: HTTPie/1.0.3
    
    [
        "\nesrever ot egasseM"
    ]
```

#### /statistic (function)

```bash
    echo "Sample message" | http POST :8080/statistic
    HTTP/1.1 200 OK
    Content-Length: 56
    Content-Type: application/json;charset=UTF-8
    accept-encoding: gzip, deflate
    connection: keep-alive
    user-agent: HTTPie/1.0.3
    
    {
        "\n": 1,
        " ": 1,
        "a": 2,
        "e": 3,
        "g": 1,
        "l": 1,
        "m": 2,
        "p": 1,
        "s": 3
    }
```

#### /unixTime (supplier)

```bash
    http :8080/unixTime  
    HTTP/1.1 200 OK
    Content-Length: 10
    Content-Type: application/json;charset=UTF-8
    accept-encoding: gzip, deflate
    connection: keep-alive
    user-agent: HTTPie/1.0.3
    
    1571218287
```

