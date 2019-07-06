package com.example.myapplication.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;


public class AFragment extends Fragment {

    private TextView mTvTitle;
    private Button mBtnChange,mBtnReset,mBtnMessage;
    private BFragment bFragment;
    private IOnMessageClick listener;
//    private Activity mActivity;

    public static AFragment fangfa(String title){
        //调用这个newInstance方法我们会的到一个传好参数的fragment
        AFragment fragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title",title);
        fragment.setArguments(bundle); //通过setArguments方法，即使Fragment被回收被重构（重新实例化），也能给新的Fragment重新设上参数
        return fragment;
    }

    public interface IOnMessageClick{
        void onClick(String text);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener=(IOnMessageClick)context;
//        try{
//            listener = (IOnMessageClick)context;
//        }catch(ClassCastException e){
//            throw new ClassCastException("Activity 必须实现 IoMessageClick接口")；
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a,container,false);
        Log.d("AFragment","----OnCreateView----");
        return view;

    }//设置布局文件

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mTvTitle = view.findViewById(R.id.tv_title);
        mBtnChange = view.findViewById(R.id.btn_change);
        mBtnReset = view.findViewById(R.id.btn_reset);
        mBtnMessage = view.findViewById(R.id.btn_message);

        mBtnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick("你好");
//                ((ContainerActivity)getActivity()).setData("你好");
            }
        });

        mBtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bFragment == null){
                    bFragment = new BFragment();
                }

                Fragment fragment = getFragmentManager().findFragmentByTag("a");
                if(fragment != null){
                    getFragmentManager().beginTransaction().hide(fragment).add(R.id.fl_container,bFragment).addToBackStack(null).commitAllowingStateLoss();
                }else{
                    getFragmentManager().beginTransaction().replace(R.id.fl_container,bFragment).addToBackStack(null).commitAllowingStateLoss();
                }

            } //这里addtobackStack(null)是为了把Fragment加到回退栈，这样的话返回可以退到上一个fragment
        });

        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTvTitle.setText("我是新文字");
            }
        });

        if(getArguments() != null){
            mTvTitle.setText(getArguments().getString("title"));
        }
//        if(getActivity() != null){
//
//        }else{
//
//        }
    }//找出对于的组件然后操作

//    @Override
//    //fragment跟activity产生关系的时候会运行这个方法，并且会传来一个参数context
//    public void onAttach(Context context) {
//        super.onAttach(context);
////        mActivity = (Activity)context;
//    }
//
//    @Override
//    //fragment跟activity脱离关系时运行这个方法detech出来肯定时null
//    public void onDetach() {
//        //
//        super.onDetach();
//    }
}

