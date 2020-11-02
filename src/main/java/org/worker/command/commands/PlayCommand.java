package org.worker.command.commands;

import com.coder.command.ICommand;
import com.coder.command.VideoPlayer;

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
