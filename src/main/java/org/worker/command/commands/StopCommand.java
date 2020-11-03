package org.worker.command.commands;


import org.worker.command.ICommand;
import org.worker.command.VideoPlayer;

public class StopCommand implements ICommand {
    private VideoPlayer videoPlayer;

    public StopCommand(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.stop();
    }
}
