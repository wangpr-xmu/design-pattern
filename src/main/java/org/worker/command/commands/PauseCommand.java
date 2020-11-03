package org.worker.command.commands;


import org.worker.command.ICommand;
import org.worker.command.VideoPlayer;

public class PauseCommand implements ICommand {
    private VideoPlayer videoPlayer;

    public PauseCommand(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.pause();
    }
}
