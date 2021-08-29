package org.worker.design.command;


import org.worker.design.command.commands.PauseCommand;
import org.worker.design.command.commands.PlayCommand;

/**
 * 命令模式
 * 对命令的封装，每一个命令都是一个操作
 * 请求的一方发出请求要求执行一个操作，接收的一方接收请求执行操作
 */
public class CommandDemo {
    public static void main(String[] args) {

        VideoPlayer videoPlayer = new VideoPlayer();

        ControlPanel controlPanel =  new ControlPanel();

        controlPanel.addCommand(new PlayCommand(videoPlayer));
        controlPanel.addCommand(new PauseCommand(videoPlayer));

        controlPanel.doCommands();

    }
}
