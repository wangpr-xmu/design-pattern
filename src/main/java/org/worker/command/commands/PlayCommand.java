package org.worker.command.commands;


import org.worker.command.ICommand;
import org.worker.command.VideoPlayer;

public class PlayCommand implements ICommand {
    private VideoPlayer videoPlayer;

    public PlayCommand(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.play();
    }
}
