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
package com.github.ppamorim.sample.ui.renderers.factory;

import com.github.ppamorim.recyclerrenderers.interfaces.RendererFactory;
import com.github.ppamorim.recyclerrenderers.renderer.Renderer;
import com.github.ppamorim.sample.R;
import com.github.ppamorim.sample.ui.renderers.renderers.ConsoleRenderer;
import com.github.ppamorim.sample.ui.renderers.renderers.HardwareRenderer;

public class Factory implements RendererFactory {

  @Override public Renderer getRenderer(int id) {
    switch (id) {
      case R.layout.adapter_console:
      case R.layout.adapter_console_alternative:
        return new ConsoleRenderer(id);
      case R.layout.adapter_hardware:
        return new HardwareRenderer(id);
      default:
        return null;
    }
  }

}