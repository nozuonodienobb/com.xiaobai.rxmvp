package cloudstore.chaoma.io.rxmvp;

import android.os.Bundle;
import android.util.Log;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.subjects.BehaviorSubject;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.lang.ref.WeakReference;

/**
 * create by 小白
 *
 * @date 2019/3/25
 */
public abstract class BaseImplPresenter<V extends BaseActivity>  {
    private final String TAG = getClass().getName();
    private WeakReference<V> v;


    public void onCreate(V v) {
        if (v == null) {
            Log.e(TAG, "view 已被销毁或被回收");
            return;
        } else {
            this.v = new WeakReference<>(v);
        }
    }

    public V getView() {
        if ( v== null) {
            Log.e(TAG, "BaseImplPresenter 的 view 已被销毁或被回收");
            return  null;
        } else {
            return v.get();
        }
    }



    public void onStart() {

    }


    public void onResume() {

    }


    public void onPause() {

    }


    public void onStop() {

    }


    public void onDestory() {
        this.v = null;
    }


}
