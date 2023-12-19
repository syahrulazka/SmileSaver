// Generated by view binder compiler. Do not edit!
package bangkit.android.capstone11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bangkit.android.capstone11.R;
import bangkit.android.capstone11.ui.custom.CustomEditText;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddKidsDataBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView bottomBar;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final CustomEditText edAddress;

  @NonNull
  public final CustomEditText edAge;

  @NonNull
  public final CustomEditText edFullName;

  @NonNull
  public final CustomEditText edToothbrushFrequency;

  @NonNull
  public final RadioButton rbFemale;

  @NonNull
  public final RadioButton rbMale;

  @NonNull
  public final RadioGroup rgGender;

  @NonNull
  public final View topBar;

  @NonNull
  public final TextView tvAddKids;

  @NonNull
  public final TextView tvAddress;

  @NonNull
  public final TextView tvAge;

  @NonNull
  public final TextView tvFullName;

  @NonNull
  public final TextView tvGender;

  @NonNull
  public final TextView tvKidsData;

  @NonNull
  public final TextView tvToothbrushFrequency;

  private ActivityAddKidsDataBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView bottomBar, @NonNull ImageView btnBack, @NonNull Button btnSave,
      @NonNull CustomEditText edAddress, @NonNull CustomEditText edAge,
      @NonNull CustomEditText edFullName, @NonNull CustomEditText edToothbrushFrequency,
      @NonNull RadioButton rbFemale, @NonNull RadioButton rbMale, @NonNull RadioGroup rgGender,
      @NonNull View topBar, @NonNull TextView tvAddKids, @NonNull TextView tvAddress,
      @NonNull TextView tvAge, @NonNull TextView tvFullName, @NonNull TextView tvGender,
      @NonNull TextView tvKidsData, @NonNull TextView tvToothbrushFrequency) {
    this.rootView = rootView;
    this.bottomBar = bottomBar;
    this.btnBack = btnBack;
    this.btnSave = btnSave;
    this.edAddress = edAddress;
    this.edAge = edAge;
    this.edFullName = edFullName;
    this.edToothbrushFrequency = edToothbrushFrequency;
    this.rbFemale = rbFemale;
    this.rbMale = rbMale;
    this.rgGender = rgGender;
    this.topBar = topBar;
    this.tvAddKids = tvAddKids;
    this.tvAddress = tvAddress;
    this.tvAge = tvAge;
    this.tvFullName = tvFullName;
    this.tvGender = tvGender;
    this.tvKidsData = tvKidsData;
    this.tvToothbrushFrequency = tvToothbrushFrequency;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddKidsDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddKidsDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_kids_data, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddKidsDataBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_bar;
      BottomNavigationView bottomBar = ViewBindings.findChildViewById(rootView, id);
      if (bottomBar == null) {
        break missingId;
      }

      id = R.id.btn_back;
      ImageView btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btn_save;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.ed_address;
      CustomEditText edAddress = ViewBindings.findChildViewById(rootView, id);
      if (edAddress == null) {
        break missingId;
      }

      id = R.id.ed_age;
      CustomEditText edAge = ViewBindings.findChildViewById(rootView, id);
      if (edAge == null) {
        break missingId;
      }

      id = R.id.ed_full_name;
      CustomEditText edFullName = ViewBindings.findChildViewById(rootView, id);
      if (edFullName == null) {
        break missingId;
      }

      id = R.id.ed_toothbrush_frequency;
      CustomEditText edToothbrushFrequency = ViewBindings.findChildViewById(rootView, id);
      if (edToothbrushFrequency == null) {
        break missingId;
      }

      id = R.id.rb_female;
      RadioButton rbFemale = ViewBindings.findChildViewById(rootView, id);
      if (rbFemale == null) {
        break missingId;
      }

      id = R.id.rb_male;
      RadioButton rbMale = ViewBindings.findChildViewById(rootView, id);
      if (rbMale == null) {
        break missingId;
      }

      id = R.id.rg_gender;
      RadioGroup rgGender = ViewBindings.findChildViewById(rootView, id);
      if (rgGender == null) {
        break missingId;
      }

      id = R.id.top_bar;
      View topBar = ViewBindings.findChildViewById(rootView, id);
      if (topBar == null) {
        break missingId;
      }

      id = R.id.tv_add_kids;
      TextView tvAddKids = ViewBindings.findChildViewById(rootView, id);
      if (tvAddKids == null) {
        break missingId;
      }

      id = R.id.tv_address;
      TextView tvAddress = ViewBindings.findChildViewById(rootView, id);
      if (tvAddress == null) {
        break missingId;
      }

      id = R.id.tv_age;
      TextView tvAge = ViewBindings.findChildViewById(rootView, id);
      if (tvAge == null) {
        break missingId;
      }

      id = R.id.tv_full_name;
      TextView tvFullName = ViewBindings.findChildViewById(rootView, id);
      if (tvFullName == null) {
        break missingId;
      }

      id = R.id.tv_gender;
      TextView tvGender = ViewBindings.findChildViewById(rootView, id);
      if (tvGender == null) {
        break missingId;
      }

      id = R.id.tv_kids_data;
      TextView tvKidsData = ViewBindings.findChildViewById(rootView, id);
      if (tvKidsData == null) {
        break missingId;
      }

      id = R.id.tv_toothbrush_frequency;
      TextView tvToothbrushFrequency = ViewBindings.findChildViewById(rootView, id);
      if (tvToothbrushFrequency == null) {
        break missingId;
      }

      return new ActivityAddKidsDataBinding((ConstraintLayout) rootView, bottomBar, btnBack,
          btnSave, edAddress, edAge, edFullName, edToothbrushFrequency, rbFemale, rbMale, rgGender,
          topBar, tvAddKids, tvAddress, tvAge, tvFullName, tvGender, tvKidsData,
          tvToothbrushFrequency);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
