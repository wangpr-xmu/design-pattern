package org.worker.command.commands;


import org.worker.command.ICommand;
import org.worker.command.VideoPlayer;

public class BackCommand implements ICommand {
    private VideoPlayer videoPlayer;

    public BackCommand(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.back();
    }
}
