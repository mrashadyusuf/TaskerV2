package com.Tasker.Tasker.ui.assignment;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class AssignmentViewModel extends AndroidViewModel {

    private AssignmentRepository mRepository;

    private final LiveData<List<Assignment>> mAllDataAssignments;

    public AssignmentViewModel (Application application){
        super(application);
        mRepository = new AssignmentRepository(application);
        mAllDataAssignments = mRepository.getAllAssignments();
    }

    LiveData<List<Assignment>> getmAllDataAssignments(){return mAllDataAssignments;}

    public void insert(Assignment assignment) {mRepository.insert(assignment);}
}
