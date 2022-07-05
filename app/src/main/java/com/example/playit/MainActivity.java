package com.example.playit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.playit.databinding.ActivityMainBinding;
import com.example.playit.fragments.DownloadFragment;
import com.example.playit.fragments.MusicFragment;
import com.example.playit.fragments.UserFragment;
import com.example.playit.fragments.VideoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private ActivityMainBinding binding = null;
    ViewPagerFragmentAdapter viewPagerFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewPagerFragmentAdapter = new ViewPagerFragmentAdapter(getSupportFragmentManager(), getLifecycle());
        viewPagerFragmentAdapter.addFragment(new VideoFragment());
        viewPagerFragmentAdapter.addFragment(new MusicFragment());
        viewPagerFragmentAdapter.addFragment(new DownloadFragment());
        viewPagerFragmentAdapter.addFragment(new UserFragment());

        binding.viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                binding.bottomNavigation.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
        
        binding.viewPager.setAdapter(viewPagerFragmentAdapter);
        binding.bottomNavigation.setOnNavigationItemSelectedListener(this);
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.video:
                binding.viewPager.setCurrentItem(0);
                break;
            case R.id.music:
                binding.viewPager.setCurrentItem(1);
                break;
            case R.id.download:
                binding.viewPager.setCurrentItem(2);
                break;
            case R.id.user:
                binding.viewPager.setCurrentItem(3);
                break;
            default:
                throw new IllegalStateException("Not Fount" + menuItem.getItemId());
        }
        return true;
    }
}