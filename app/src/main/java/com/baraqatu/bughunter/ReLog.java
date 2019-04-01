package com.baraqatu.bughunter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ReLog extends AppCompatActivity {

    private Button signin, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_log);
    }

    public Button getSignin() {
        return signin;
    }

    public void setSignin(Button signin) {
        this.signin = signin;
    }

    public Button getSignup() {
        return signup;
    }

    public void setSignup(Button signup) {
        this.signup = signup;
    }
}
