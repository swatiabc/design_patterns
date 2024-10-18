package structural.bridge.controller;

import structural.bridge.remote.MobileRemote;
import structural.bridge.remote.Remote;

public class AdvanceController extends BaseController{
    public AdvanceController(Remote remote) {
        this.remote = remote;
    }

    public void mute() {
        remote.setVolume(0);
    }
}
