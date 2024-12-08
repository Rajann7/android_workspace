class Sender {
    fun send(msg: String) {
        println("Sending $msg")
        println("$msg Sent")
    }
}

class ThreadSend(var sender: Sender, var msg: String) : Runnable {
    override fun run() {
        synchronized(sender) {
            sender.send(msg)
        }
    }
}

fun main() {
    var sender = Sender()

    var t1 = Thread(ThreadSend(sender, "Hii"))
    var t2 = Thread(ThreadSend(sender, "Byee"))

    t1.start()
    t2.start()
}

