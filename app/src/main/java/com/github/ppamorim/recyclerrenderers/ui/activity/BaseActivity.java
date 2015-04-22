/*
* Copyright (C) 2015 Pedro Paulo de Amorim
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.github.ppamorim.recyclerrenderers.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import butterknife.InjectView;
import com.github.ppamorim.recyclerrenderers.R;
import com.github.ppamorim.recyclerrenderers.util.ViewUtil;

public class BaseActivity extends AbstractActivity {

  @InjectView(R.id.toolbar_title) TextView toolbarTitle;
  @InjectView(R.id.recycler_view) RecyclerView recyclerView;

  @Override protected int getContentViewId() {
    return R.layout.activity_base;
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    toolbarTitle.setText(getResources().getString(R.string.app_name));
    ViewUtil.configRecyclerView(this, recyclerView);
  }

}