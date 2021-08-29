package org.worker.design.command.commands;


import org.worker.design.command.ICommand;
import org.worker.design.command.VideoPlayer;

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
