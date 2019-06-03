package com.example.schedulemanagement.view.activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.schedulemanagement.R;
import com.example.schedulemanagement.utils.StatusBarUtil;
import com.example.schedulemanagement.view.fragment.LoginFragment;
import com.example.schedulemanagement.view.fragment.RegisterFragment;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        StatusBarUtil.immersiveInImage(this);
        replaceFragment(new LoginFragment());
    }

    /**
     * 移除注册界面
     */
    public void toRegisterFragment() {
            replaceFragment(RegisterFragment.newInstance());
    }


    /**
     * 切换登录和注册
     * @param fragment 碎片
     */
    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContain, fragment);
        if (fragment instanceof RegisterFragment) transaction.addToBackStack(null);
        transaction.commit();
    }
}
