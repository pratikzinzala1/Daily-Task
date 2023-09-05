package test.task2

fun main() {

    val server = Server()

    val db = MongoDBConnection(server)
    db.sendConnectionRequest("GET")
    db.receiveRequest()
    db.establishConnection(245, 22)
    db.disconnectConnection()

}

class Server {
    private var serverPort: Int = 0
    private var requestMethod: String = ""
    private var ack: String = ""
    private var isConnected:Boolean = false

    fun receiveRequest(method: String) {
        if (method == "GET") {
            requestMethod = method
            sendAck()
        } else {
            println("Request can not proceed")
        }
    }

    fun getRequestMethod(): String {
        return requestMethod
    }

    private fun sendAck() {
        ack = "HTTP/OK"
    }

    fun getAck(): String {
        return ack
    }

    fun setServerPort(serverPort: Int) {
        this.serverPort = serverPort
        this.isConnected = true
        println("Connection established")
    }

    fun disconnectServer() {
        if (isConnected){
            isConnected = false
            serverPort = 0
            requestMethod = ""
            ack = "DISCONNECT"
        }
        else{
            println("server already disconnected")
        }

    }

}

class MongoDBConnection(private var server: Server) : DbConnect {

    private var clientPort: Int = 0
    override fun sendConnectionRequest(method: String) {
        server.receiveRequest(method)
        println("Sending request to server using method $method")
    }

    override fun receiveRequest() {
        if (server.getAck() == "HTTP/OK") {
            println("Received Message  ${server.getAck()}")
        } else {
            println("does not received any request")
        }
    }

    override fun establishConnection(clientPort: Int, serverPort: Int) {
        if (server.getAck() == "HTTP/OK") {
            this.clientPort = clientPort
            server.setServerPort(serverPort)
            println("Establishing connection on client port $clientPort and server port $serverPort")

        } else {
            println("Can not establish connection")
        }
    }

    override fun disconnectConnection() {
        println("Disconnecting From Server")
        server.disconnectServer()
        clientPort = 0
    }

}

interface DbConnect {
    fun sendConnectionRequest(method: String)
    fun receiveRequest()
    fun establishConnection(clientPort: Int, serverPort: Int)
    fun disconnectConnection()

}