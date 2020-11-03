package org.worker.command.commands;


import org.worker.command.ICommand;
import org.worker.command.VideoPlayer;

public class NextCommand implements ICommand {
    private VideoPlayer videoPlayer;

    public NextCommand(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.next();
    }
}
