package cloudstore.chaoma.io.rxmvp;

/**
 * create by 小白
 *
 * @date 2019/3/27
 */
public class TestPresenter extends BaseImplPresenter<TestActivity> {

    private String testZ = "ss";

    @Override
    public void onCreate(TestActivity testActivity) {
        super.onCreate(testActivity);
        getView().showToast(testZ);
    }


    public void upDate() {
        testZ = "ssss";
        getView().showToast(testZ);
    }

}
