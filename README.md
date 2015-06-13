列表中如果存在checkbox导致列表不可点击问题解决方案；
方案1：
<CheckBox 
        android:id="@+id/cb"
       	android:focusable="false"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:layout_centerVertical="true"
        />
方案 2：
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content" 
    android:descendantFocusability="blocksDescendants"
    android:padding="10dp"
    >
