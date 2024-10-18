package structural.bridge.controller;

import structural.bridge.remote.Remote;

public class BaseController {
    protected Remote remote;

    public BaseController(){}

    public BaseController(Remote remote) {
        this.remote = remote;
    }

    public Remote getRemote() {
        return remote;
    }

    public void toggle() {
        if (remote.isEnabled()) {
            remote.disable();
        }
        else {
            remote.enable();
        }
    }

    public void downVolume(int volume) {
        remote.setVolume(getRemote().getVolume()-volume);
    }

    public void upVolume(int volume) {
        remote.setVolume(getRemote().getVolume()+volume);
    }
}
