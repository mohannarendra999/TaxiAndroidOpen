//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0-SNAPSHOT.
//


package com.opentaxi.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import com.opentaxi.android.R.id;
import com.opentaxi.android.R.layout;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class UserPassActivity_
    extends UserPassActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private Handler handler_ = new Handler(Looper.getMainLooper());

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.login);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static UserPassActivity_.IntentBuilder_ intent(Context context) {
        return new UserPassActivity_.IntentBuilder_(context);
    }

    public static UserPassActivity_.IntentBuilder_ intent(Fragment supportFragment) {
        return new UserPassActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        submitButton = ((Button) hasViews.findViewById(id.clientLoginButton));
        pass = ((EditText) hasViews.findViewById(id.passwordField));
        userName = ((EditText) hasViews.findViewById(id.userNameField));
        if (hasViews.findViewById(id.newClient)!= null) {
            hasViews.findViewById(id.newClient).setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    UserPassActivity_.this.newClient();
                }

            }
            );
        }
        if (hasViews.findViewById(id.clientLoginButton)!= null) {
            hasViews.findViewById(id.clientLoginButton).setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    UserPassActivity_.this.clientLoginButton();
                }

            }
            );
        }
        if (hasViews.findViewById(id.lostPassword)!= null) {
            hasViews.findViewById(id.lostPassword).setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    UserPassActivity_.this.lostPassword();
                }

            }
            );
        }
        afterLoad();
    }

    @Override
    public void setError(final String error) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                UserPassActivity_.super.setError(error);
            }

        }
        );
    }

    @Override
    public void login(final String username, final String password) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    UserPassActivity_.super.login(username, password);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        UserPassActivity_.super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case  1 :
                UserPassActivity_.this.onResult(resultCode, data);
                break;
        }
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, UserPassActivity_.class);
        }

        public IntentBuilder_(Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, UserPassActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public UserPassActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (context_ instanceof Activity) {
                    ((Activity) context_).startActivityForResult(intent_, requestCode);
                } else {
                    context_.startActivity(intent_);
                }
            }
        }

    }

}
