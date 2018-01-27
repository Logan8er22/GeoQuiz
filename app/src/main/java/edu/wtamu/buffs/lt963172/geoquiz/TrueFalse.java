package edu.wtamu.buffs.lt963172.geoquiz;

/**
 * Created by lt963172 on 1/26/2018.
 */

public class TrueFalse {

    private int mQuestion;
    // this variable will hold a resource ID for a string

    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}
