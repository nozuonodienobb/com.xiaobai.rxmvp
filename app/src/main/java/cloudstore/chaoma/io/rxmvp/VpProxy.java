package cloudstore.chaoma.io.rxmvp;

import android.util.Log;

/**
 * create by 小白
 *
 * @date 2019/3/27
 */
public class VpProxy <P extends BaseImplPresenter> {

    private final String TAG = getClass().getName();

    private P proxyP;
    private Object proxyView;

    public VpProxy(Object proxyView) {
        this.proxyView = proxyView;
    }

    void onCreate() {
        if (proxyView != null && proxyView instanceof BaseActivity) {
            SetPresenter setPresenter = proxyView.getClass().getAnnotation(SetPresenter.class);
            if (setPresenter == null) {
                Log.e(TAG, "请给" + proxyView.getClass().getName() + "view设置Presenter");
                return;
            }
            try {
                proxyP = (P) setPresenter.value().newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
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
