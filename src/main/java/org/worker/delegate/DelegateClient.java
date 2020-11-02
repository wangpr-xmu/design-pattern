package org.worker.delegate;

public class DelegateClient {
    public static void main(String[] args) {
        new Boss().command("web", new Leader());
        new Boss().command("needing", new Leader());
        new Boss().command("nothing", new Leader());
    }
}
