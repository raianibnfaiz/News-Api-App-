// Generated by view binder compiler. Do not edit!
package com.raian.newsappproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
<<<<<<< HEAD
import android.widget.RelativeLayout;
=======
import android.widget.LinearLayout;
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
<<<<<<< HEAD
=======
import androidx.constraintlayout.utils.widget.ImageFilterButton;
import androidx.constraintlayout.widget.ConstraintLayout;
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.raian.newsappproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemLayoutBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
<<<<<<< HEAD
  public final CardView cvCardView;
=======
  public final LinearLayout authorAndDate;

  @NonNull
  public final CardView cardViewNews;

  @NonNull
  public final ImageFilterButton deleteBookMark;

  @NonNull
  public final ConstraintLayout details;
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119

  @NonNull
  public final ImageView ivImage;

  @NonNull
<<<<<<< HEAD
  public final RelativeLayout rlWrapper;

  @NonNull
=======
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119
  public final TextView tvAuthor;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvPublishDate;

  @NonNull
  public final TextView tvTitle;

<<<<<<< HEAD
  private ItemLayoutBinding(@NonNull CardView rootView, @NonNull CardView cvCardView,
      @NonNull ImageView ivImage, @NonNull RelativeLayout rlWrapper, @NonNull TextView tvAuthor,
      @NonNull TextView tvDescription, @NonNull TextView tvPublishDate, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.cvCardView = cvCardView;
    this.ivImage = ivImage;
    this.rlWrapper = rlWrapper;
=======
  private ItemLayoutBinding(@NonNull CardView rootView, @NonNull LinearLayout authorAndDate,
      @NonNull CardView cardViewNews, @NonNull ImageFilterButton deleteBookMark,
      @NonNull ConstraintLayout details, @NonNull ImageView ivImage, @NonNull TextView tvAuthor,
      @NonNull TextView tvDescription, @NonNull TextView tvPublishDate, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.authorAndDate = authorAndDate;
    this.cardViewNews = cardViewNews;
    this.deleteBookMark = deleteBookMark;
    this.details = details;
    this.ivImage = ivImage;
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119
    this.tvAuthor = tvAuthor;
    this.tvDescription = tvDescription;
    this.tvPublishDate = tvPublishDate;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
<<<<<<< HEAD
      CardView cvCardView = (CardView) rootView;
=======
      id = R.id.authorAndDate;
      LinearLayout authorAndDate = ViewBindings.findChildViewById(rootView, id);
      if (authorAndDate == null) {
        break missingId;
      }

      CardView cardViewNews = (CardView) rootView;

      id = R.id.deleteBookMark;
      ImageFilterButton deleteBookMark = ViewBindings.findChildViewById(rootView, id);
      if (deleteBookMark == null) {
        break missingId;
      }

      id = R.id.details;
      ConstraintLayout details = ViewBindings.findChildViewById(rootView, id);
      if (details == null) {
        break missingId;
      }
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119

      id = R.id.iv_image;
      ImageView ivImage = ViewBindings.findChildViewById(rootView, id);
      if (ivImage == null) {
        break missingId;
      }

<<<<<<< HEAD
      id = R.id.rl_wrapper;
      RelativeLayout rlWrapper = ViewBindings.findChildViewById(rootView, id);
      if (rlWrapper == null) {
        break missingId;
      }

=======
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119
      id = R.id.tv_author;
      TextView tvAuthor = ViewBindings.findChildViewById(rootView, id);
      if (tvAuthor == null) {
        break missingId;
      }

      id = R.id.tv_description;
      TextView tvDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvDescription == null) {
        break missingId;
      }

      id = R.id.tv_publishDate;
      TextView tvPublishDate = ViewBindings.findChildViewById(rootView, id);
      if (tvPublishDate == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

<<<<<<< HEAD
      return new ItemLayoutBinding((CardView) rootView, cvCardView, ivImage, rlWrapper, tvAuthor,
          tvDescription, tvPublishDate, tvTitle);
=======
      return new ItemLayoutBinding((CardView) rootView, authorAndDate, cardViewNews, deleteBookMark,
          details, ivImage, tvAuthor, tvDescription, tvPublishDate, tvTitle);
>>>>>>> 3463a18baddb9f1f5bdb3373b9c94df267e1e119
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
