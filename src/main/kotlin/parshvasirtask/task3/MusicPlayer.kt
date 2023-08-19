package parshvasirtask.task3





fun main(){

    val musicPlayer = MusicPlayer()
    musicPlayer.play()
    musicPlayer.stop()
    musicPlayer.resume()
    musicPlayer.pause()

    val videoPlayer = VideoPlayer()
    videoPlayer.play()
    videoPlayer.stop()

}
class MusicPlayer :Playable{
    private var isMusicPlaying:Boolean = false
    private var isMusicPaused:Boolean = false
    override fun play() {
        isMusicPlaying = true
        println("Music is playing")
    }

    override fun pause() {
        if (isMusicPlaying && !isMusicPaused){
            isMusicPaused = true
            println("Music is paused")
        }else{
            println("Music is not playing or already paused")
        }

    }



    override fun resume() {
        if (isMusicPlaying && isMusicPaused){
            isMusicPaused = false
            println("Music resumed")
        }

        else{
            println("Music is not paused or playing")
        }

    }

    override fun stop() {
        if (isMusicPlaying){
            pause()
            isMusicPlaying = false
            println("Music stopped")
        }else{
            println("Music already stopped")
        }

    }
}

class VideoPlayer:Playable{
    private var isVideoPlaying:Boolean = false
    private var isVideoPaused:Boolean = false
    override fun play() {
        isVideoPlaying = true
        println("Video is playing")
    }

    override fun pause() {
        if (isVideoPlaying && !isVideoPaused){
            isVideoPaused = true
            println("Video is paused")
        }else{
            println("Video is not playing or already paused")
        }
    }

    override fun resume() {
        if (isVideoPlaying && isVideoPaused){
            isVideoPaused = false
            println("Video resumed")
        }
        else{
            println("Video is not paused or playing")
        }

    }

    override fun stop() {
        if (isVideoPlaying){
            pause()
            isVideoPlaying = false
            println("Video stopped")
        }else{
            println("Video already stopped")
        }

    }

}


interface Playable {
    fun play()
    fun pause()
    fun resume()
    fun stop()

}