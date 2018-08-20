package com.samzlab.myapplication;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothAdapter;
import android.widget.ListAdapter;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.widget.AbsListView;

import java.util.ArrayList;


/**
 * Created by mE on 8/20/2018.
 */

public abstract class DeviceListFragment extends Fragment implements AbsListView.OnItemClickListener {

public 
    private final BroadcastReceiver bReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                Device

            }
        }
    }
}
