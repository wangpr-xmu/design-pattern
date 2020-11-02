package org.worker.command;

import com.coder.command.commands.PauseCommand;
import com.coder.command.commands.PlayCommand;

public class CommandClient {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();

        ControlPanel controlPanel =  new ControlPanel();

        controlPanel.addCommand(new PlayCommand(videoPlayer));
        controlPanel.addCommand(new PauseCommand(videoPlayer));

        controlPanel.doCommands();

    }
}
