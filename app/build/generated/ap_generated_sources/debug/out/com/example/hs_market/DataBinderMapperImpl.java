package com.example.hs_market;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.hs_market.databinding.ActivityBoardEditBindingImpl;
import com.example.hs_market.databinding.ActivityBoardInsideBindingImpl;
import com.example.hs_market.databinding.ActivityBoardWriteBindingImpl;
import com.example.hs_market.databinding.ActivityRouletteBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBOARDEDIT = 1;

  private static final int LAYOUT_ACTIVITYBOARDINSIDE = 2;

  private static final int LAYOUT_ACTIVITYBOARDWRITE = 3;

  private static final int LAYOUT_ACTIVITYROULETTE = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hs_market.R.layout.activity_board_edit, LAYOUT_ACTIVITYBOARDEDIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hs_market.R.layout.activity_board_inside, LAYOUT_ACTIVITYBOARDINSIDE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hs_market.R.layout.activity_board_write, LAYOUT_ACTIVITYBOARDWRITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hs_market.R.layout.activity_roulette, LAYOUT_ACTIVITYROULETTE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBOARDEDIT: {
          if ("layout/activity_board_edit_0".equals(tag)) {
            return new ActivityBoardEditBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_board_edit is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBOARDINSIDE: {
          if ("layout/activity_board_inside_0".equals(tag)) {
            return new ActivityBoardInsideBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_board_inside is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBOARDWRITE: {
          if ("layout/activity_board_write_0".equals(tag)) {
            return new ActivityBoardWriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_board_write is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYROULETTE: {
          if ("layout/activity_roulette_0".equals(tag)) {
            return new ActivityRouletteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_roulette is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "activity");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_board_edit_0", com.example.hs_market.R.layout.activity_board_edit);
      sKeys.put("layout/activity_board_inside_0", com.example.hs_market.R.layout.activity_board_inside);
      sKeys.put("layout/activity_board_write_0", com.example.hs_market.R.layout.activity_board_write);
      sKeys.put("layout/activity_roulette_0", com.example.hs_market.R.layout.activity_roulette);
    }
  }
}
