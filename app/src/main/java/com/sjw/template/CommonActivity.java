package com.sjw.template;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;

public class CommonActivity extends BaseActivity {

    private Context context = CommonActivity.this;


    @Override
    protected void initView() {

    }

    @Override
    protected void judgeNet() {

    }

    @Override
    protected void setLayoutId() {
        setContentView(R.layout.activity_common);

    }

    @Override
    protected void initData() {


//        Call<ResponseBody> requestCall = RetrofitInit.getIntence().request(getMap());
//        BaseRetrofit baseRetrofit = new BaseRetrofit() {
//            @Override
//            protected void showData(String jsonStr) {
//                super.showData(jsonStr);
//
//            }
//
//            @Override
//            protected void showError(int i, Throwable t) {
//                super.showError(i, t);
//
//            }
//        };
//        requestCall.enqueue(baseRetrofit);


    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void beforeUnbinder() {


    }


}


  

  

