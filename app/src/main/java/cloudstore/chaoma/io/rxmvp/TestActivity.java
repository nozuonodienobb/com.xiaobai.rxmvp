package cloudstore.chaoma.io.rxmvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

/**
 * create by 小白
 *
 * @date 2019/3/27
 */
public class TestActivity extends BaseActivity<TestPresenter> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViewById(R.id.tv_on).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().upDate();
            }
        });
    }

    @Override
    protected TestPresenter setP() {
        return new TestPresenter() ;
    }

    @Override
    protected int getResId() {
        return R.layout.activity_main;
    }

    public void showToast(String ss) {
        Toast.makeText(this, ss, Toast.LENGTH_LONG).show();
    }
}
