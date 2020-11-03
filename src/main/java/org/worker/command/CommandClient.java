package org.worker.command;


import org.worker.command.commands.PauseCommand;
import org.worker.command.commands.PlayCommand;

public class CommandClient {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();

        ControlPanel controlPanel =  new ControlPanel();

        controlPanel.addCommand(new PlayCommand(videoPlayer));
        controlPanel.addCommand(new PauseCommand(videoPlayer));

        controlPanel.doCommands();

    }
}
