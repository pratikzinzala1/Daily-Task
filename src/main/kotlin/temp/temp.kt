package temp

import java.util.concurrent.Flow


fun main() {


}



class MediaDownloader:AudioDownloader{

    override fun downloadAudio() {


    }

    override fun download() {


    }

}

interface AudioDownloader:Downloader{
    fun downloadAudio()
}

interface Downloader{
    fun download()
}