/*
 * Copyright (C) 2022 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.xuexiang.rxjava3sample.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.renderscript.ScriptGroup
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.xuexiang.rxjava3sample.R
import com.xuexiang.rxjava3sample.databinding.ActivitySplashBinding

public class SplashActivity : AppCompatActivity() {
    /**
     * ViewBinding
     */
    private lateinit var binding: ActivitySplashBinding

    companion object {
        private const val TAG = "SplashActivity"
    }
    private  val  handler:Handler= Handler()
    private lateinit var  runnable: Runnable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        runnable = Runnable {
            var intent :Intent = Intent(this@SplashActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        handler.postDelayed(runnable,3000)
    }

}
