public static void startAddWithCustomer(Activity activity, String customCode,
                                            String customName) {
        if (TextUtils.isEmpty(customCode)) {
            throw new NullPointerException("customCode could not be null");
        }
        if (TextUtils.isEmpty(customName)) {
        }
        Intent intent = new Intent(activity, CustomContactAddEditActivity.class);
        intent.putExtra(Mode, ADD_WITH_CUSTOM);
        intent.putExtra(CUSTOM_CODE, customCode);
        intent.putExtra(CUSTOM_NAME, customName);
        activity.startActivityForResult(intent, CONTACT_CHANGE);
        activity.startActivity(intent);
    }
