/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.support.v7.widget;

import android.support.v7.testutils.BaseTestActivity;

/**
 * This activity is used to test the auto-size feature of the {@link AppCompatTextView}
 * class.
 */
public class AppCompatTextViewAutoSizeActivity extends BaseTestActivity {
    @Override
    protected int getContentViewLayoutResId() {
        return android.support.v7.appcompat.test.R.layout.appcompat_textview_autosize_activity;
    }
}
