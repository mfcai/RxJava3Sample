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

package com.xuexiang.rxjava3sample

import android.app.Activity
import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
inline fun <reified T : ViewBinding> inflateViewBinding(layoutInflater: LayoutInflater) =
        T::class.java.getMethod("inflate", LayoutInflater::class.java).invoke(null, layoutInflater) as T
inline fun <reified T : ViewBinding> Activity.inflate() = lazy {
    inflateViewBinding<T>(layoutInflater).apply { setContentView(root) }
}