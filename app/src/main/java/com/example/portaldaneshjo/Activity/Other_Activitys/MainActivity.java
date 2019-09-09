package com.example.portaldaneshjo.Activity.Other_Activitys;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.portaldaneshjo.Fragments.DarkhasteDaneshjoii;
import com.example.portaldaneshjo.Fragments.EntekhabVahed;
import com.example.portaldaneshjo.Fragments.OmorAmozeshi;
import com.example.portaldaneshjo.Fragments.OmorMalli;
import com.example.portaldaneshjo.R;
import com.example.portaldaneshjo.Util;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    Toolbar toolbar;
    TabLayout tabLayout;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView imgProfile;
    TextView txtName , txtCode;

    OmorMalli malli = new OmorMalli();
    OmorAmozeshi amozeshi = new OmorAmozeshi();
    DarkhasteDaneshjoii darkhast = new DarkhasteDaneshjoii();
    EntekhabVahed vahed = new EntekhabVahed();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager_id);
        toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout_id);
        navigationView = (NavigationView) findViewById(R.id.navigation_view_id);

        View ss = navigationView.getHeaderView(0);
        txtName = (TextView) ss.findViewById(R.id.user_name_id);
        txtCode = (TextView) ss.findViewById(R.id.student_num_id);
        imgProfile = (ImageView) ss.findViewById(R.id.profile_id);

        SharedPreferences saver = this.getSharedPreferences("login" , Context.MODE_PRIVATE);
        String name = saver.getString("FullName" , null);
        txtName.setText(name);
        Toast.makeText(this, name + " خوش آمدید !", Toast.LENGTH_LONG).show();
        String code = saver.getString("StudentCode" , null);
        txtCode.setText(code);
        String image = saver.getString("ProfilePic" , null);
        Picasso.get().load(image).into(imgProfile);



        final ActionBar actionBar = getSupportActionBar();

        final ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar,R.string.open_navigation,R.string.close_navigation);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        /*
        txtName.setText(saver.getString("FullName" , null));
        txtCode.setText(saver.getString("StudentCode" , null));
        String imageurl = saver.getString("ProfilePic" , null);
        Picasso.get().load(imageurl).into(imgProfile);*/

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.person_info_id: {
                        Toast.makeText(MainActivity.this, "اطلاعات شخصی", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.mail_id: {
                        Toast.makeText(MainActivity.this, "پیام ها", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.parvande_id:{
                        Toast.makeText(MainActivity.this, "پرونده دیجیتال", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.kholase_vaze_tahsili_id:{
                        startActivity(new Intent(getApplicationContext(),Kholase_tahsili.class));
                        overridePendingTransition(R.anim.enter,R.anim.exit);
                        drawerLayout.closeDrawers();break;

                    }
                    case R.id.map_id:{
                        Toast.makeText(MainActivity.this, "نقشه", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.phone_id:{
                        startActivity(new Intent(getApplicationContext(),Sabte_mobile.class));
                        overridePendingTransition(R.anim.enter,R.anim.exit);
                        drawerLayout.closeDrawers();break;
                    }
                    case R.id.exit_id:{
                        finish();break;
                    }
                }
                return true;
            }
        });

        toolbar.setTitle("تهران شمال");
        setSupportActionBar(toolbar);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        setTabIcons();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.change_pass_id:{
                startActivity(new Intent(getApplicationContext(),Changepassword.class));
                overridePendingTransition(R.anim.enter,R.anim.exit);break;
            }
            case R.id.exit_tool_id:{
                finish();
            }
        }
        return super.onOptionsItemSelected(item);
    }

    private void setTabIcons() {
        int[] ids = {R.drawable.mali,
                R.drawable.ic_amozeshi_24dp,
                R.drawable.ic_darkhast_24dp,R.drawable.ic_vahed_24dp};
        int selectedColor = Color.parseColor("#C70000");
        int unSelectedColor = Color.parseColor("#ffffff");
        Util.setupTabIcons(getApplicationContext(),tabLayout,ids,1,selectedColor,unSelectedColor);
    }

    private void setUpViewPager(ViewPager viewPager) {
        Util.ViewPagerAdapter adapter = new Util.ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(malli, "امور مالی");
        adapter.addFragment(amozeshi, "امور آموزشی");
        adapter.addFragment(darkhast, "درخواست");
        adapter.addFragment(vahed, "انتخاب واحد");
        viewPager.setAdapter(adapter);
    }
}