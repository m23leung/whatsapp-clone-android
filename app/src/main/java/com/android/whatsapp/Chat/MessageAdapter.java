package com.android.whatsapp.Chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.whatsapp.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageListViewHolder> {

    ArrayList<MessageObject> messageList;

    public MessageAdapter(ArrayList<MessageObject> messageList) {
        this.messageList = messageList;
    }

    @NonNull
    @Override
    public MessageListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);

        MessageListViewHolder rcv = new MessageListViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull MessageListViewHolder holder, int position) {
        holder.mMessage.setText(messageList.get(position).getMessage());
        holder.mSender.setText(messageList.get(position).getSenderId());
    }

    @Override
    public int getItemCount() {
        if (messageList == null)
            return 0;

        return messageList.size();
    }


    class MessageListViewHolder extends RecyclerView.ViewHolder {

        TextView mMessage, mSender;

        LinearLayout mLayout;
        MessageListViewHolder(View view) {
            super(view);
            mMessage = view.findViewById(R.id.message);
            mSender = view.findViewById(R.id.sender);
        }
    }
}
