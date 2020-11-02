package org.worker.command.commands;

import com.coder.command.ICommand;
import com.coder.command.VideoPlayer;

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
