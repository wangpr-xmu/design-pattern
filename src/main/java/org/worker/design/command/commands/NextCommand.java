package org.worker.design.command.commands;


import org.worker.design.command.ICommand;
import org.worker.design.command.VideoPlayer;

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
