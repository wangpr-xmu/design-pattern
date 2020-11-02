package org.worker.command.commands;

import com.coder.command.ICommand;
import com.coder.command.VideoPlayer;

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
