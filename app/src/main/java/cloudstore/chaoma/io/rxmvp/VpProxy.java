package cloudstore.chaoma.io.rxmvp;

/**
 * create by 小白
 *
 * @date 2019/3/27
 */
public class VpProxy <P extends BaseImplPresenter> {

    private P proxyP;
    private Object proxyView;

    public VpProxy(Object proxyView) {
        this.proxyView = proxyView;
    }

    void onCreate() {
        if (proxyView != null && proxyView instanceof BaseActivity) {
            proxyP = (P) ((BaseActivity) proxyView).setP();
            proxyP.onCreate((BaseActivity) proxyView);
        }
    }

    public P getPresenter() {
        if (proxyP == null) {
            return null;
        }
        return proxyP;
    }

    void onDestory() {
        proxyP.onDestory();
        proxyP = null;
        proxyView = null;
    }



}
