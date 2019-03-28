package cloudstore.chaoma.io.rxmvp;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;



/**
 * create by 小白
 *
 * @date 2019/3/25
 */
public abstract class BaseActivity<P extends BaseImplPresenter>  extends AppCompatActivity {

    private VpProxy<P> vpProxy = new VpProxy<>(this);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getResId());
        vpProxy.onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        vpProxy.onDestory();
    }

    public P getPresenter() {
        return vpProxy.getPresenter();
    }

    @LayoutRes
    protected abstract int getResId();

}
