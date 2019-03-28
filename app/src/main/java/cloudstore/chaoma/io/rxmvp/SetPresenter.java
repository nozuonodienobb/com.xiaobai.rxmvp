package cloudstore.chaoma.io.rxmvp;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * create by 小白
 *
 * @date 2019/3/28
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface SetPresenter {
    Class<? extends BaseImplPresenter> value();
}
