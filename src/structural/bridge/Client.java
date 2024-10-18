package structural.bridge;

import structural.bridge.controller.AdvanceController;
import structural.bridge.controller.BaseController;
import structural.bridge.remote.MobileRemote;
import structural.bridge.remote.Remote;
import structural.bridge.remote.TvRemote;

public class Client {
    public void main() {
        MobileRemote mobileRemote = new MobileRemote();
        AdvanceController advanceController = new AdvanceController(mobileRemote);
        advanceController.mute();

        TvRemote tvRemote = new TvRemote();
        BaseController remote = new BaseController(tvRemote);
        remote.toggle();
    }
}
