package com.sofn.model.generator;

import com.sofn.core.base.BaseModel;
import com.sofn.core.util.StringUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 监测任务模型对象
 * @author moon.l
 *
 */
@SuppressWarnings("serial")
public class AdsMonitorTask extends BaseModel {


	/*
	* 对应字段
	*/
    //public String id;//主键

    private String taskName; //任务名称
    private String monitorClass; //监测类型(例行监测,专项监测,监督抽查)
    private String releaseUnit; //发布单位
    private String checkModel; //检测模型
    private String modelTitle;  //模型名称
    private String year; //年度
    private String batch; //批次
    private BigDecimal separation; //抽检分离

    public void setCstartTime(String cstartTime) {
        this.cstartTime = cstartTime;
    }

    public void setCendTime(String cendTime) {
        this.cendTime = cendTime;
    }

    public String getCstartTime() {

        return cstartTime;
    }

    public String getCendTime() {
        return cendTime;
    }

    private String cstartTime; //任务开始时间
    private String cendTime; //任务结束时间
    private String startTime; //任务开始时间
    private String endTime; //任务结束时间
    private String deadline; //抽样信息上报截止时间
    private String attachment; //附件
    private String attachmentcode; //附件编号
    private String comment; //备注
    private BigDecimal publishStatus; //发布状态 (0:未发布  1：已发布 2：执行中 3：已终止) 3,已完成 4，已结束，未完成
    private String industry; //行业
    private String judgeStandard; //判定标准
    private String sampleLink; //抽样环节
    private String checkObject; //检测对象
    private String checkProject; //检测项目
    private int rn;  //序号
    private String taskSource;  //任务来源 (DEPTASK : 部级任务  SUPTASK 监管下发 SDPTASK 监管执行任务  )
    private String task_ids; //任务ids
    private List<AdsOrganTask> adsOrganTaskList;
    private String leve;//级别
    private String attachmentAddress;//附件路径
    private String abolish;//废止状态,(0表示未发布。1表示已发布 2表示已废止)
    private String organId;//组织机构ID
    private String supId;//监管任务ID
    private String industryId;//行业id
    private String monitorType;//排除某项监测类型
    private String is_history; //是否是历史任务
    private String createOrgRegionId;//区域编码
    private String levelEnum; //机构级别
	/*
	* 主键

	public String getPrimaryKey() {
        return id;
    }

    public void setPrimaryKey(String key) {
        this.id = key;
    }

	public String getId(){
        return id;
    }
	//id set
    public void setId(String id){
        this.id = id;
    }
    */



    /*
    *其余字段
    */
    //任务名称 get

    public void setAdsOrganTaskList(List<AdsOrganTask> adsOrganTaskList) {
        this.adsOrganTaskList = adsOrganTaskList;
    }

    public List<AdsOrganTask> getAdsOrganTaskList() {
        return adsOrganTaskList;
    }

    public String getTaskName(){
        if(StringUtils.isNotEmpty(taskName)){
            taskName=StringUtils.trim(taskName);
        }
        return taskName;
    }
    //任务名称 set
    public void setTaskName(String taskName){
        this.taskName = taskName;
    }
    //监测类型 get
    public String getMonitorClass(){
        return monitorClass;
    }
    //监测类型 set
    public void setMonitorClass(String monitorClass){
        this.monitorClass = monitorClass;
    }
    //发布单位 get
    public String getReleaseUnit(){
        return releaseUnit;
    }
    //发布单位 set
    public void setReleaseUnit(String releaseUnit){
        this.releaseUnit = releaseUnit;
    }
    //检测模型 get
    public String getCheckModel(){
        return checkModel;
    }
    //检测模型 set
    public void setCheckModel(String checkModel){
        this.checkModel = checkModel;
    }
    //年度 get
    public String getYear(){
        return year;
    }
    //年度 set
    public void setYear(String year){
        this.year = year;
    }
    //批次 get
    public String getBatch(){
        return batch;
    }
    //批次 set
    public void setBatch(String batch){
        this.batch = batch;
    }
    //抽检分离 get
    public BigDecimal getSeparation(){
        return separation;
    }
    //抽检分离 set
    public void setSeparation(BigDecimal separation){
        this.separation = separation;
    }
    //任务开始时间 get
    public String getStartTime(){
        return startTime;
    }
    //任务开始时间 set
    public void setStartTime(String startTime){
        this.startTime = startTime;
    }
    //任务结束时间 get
    public String getEndTime(){
        return endTime;
    }
    //任务结束时间 getDeadline
    public void setEndTime(String endTime){
        this.endTime = endTime;
    }
    //抽样信息上报截止时间 get
    public String getDeadline(){
        return deadline;
    }
    //抽样信息上报截止时间 set
    public void setDeadline(String deadline){
        this.deadline = deadline;
    }
    //附件 get
    public String getAttachment(){
        return attachment;
    }
    //附件 set
    public void setAttachment(String attachment){
        this.attachment = attachment;
    }
    //附件编号 get
    public String getAttachmentcode(){
        return attachmentcode;
    }
    //附件编号 set
    public void setAttachmentcode(String attachmentcode){
        this.attachmentcode = attachmentcode;
    }
    //备注 get
    public String getComment(){
        return comment;
    }
    //备注 set
    public void setComment(String comment){
        this.comment = comment;
    }
    //发布状态 get
    public BigDecimal getPublishStatus(){
        return publishStatus;
    }
    //发布状态 set
    public void setPublishStatus(BigDecimal publishStatus){
        this.publishStatus = publishStatus;
    }
    //行业 get
    public String getIndustry(){
        return industry;
    }
    //行业 set
    public void setIndustry(String industry){
        this.industry = industry;
    }
    //判定标准 get
    public String getJudgeStandard(){
        return judgeStandard;
    }
    //判定标准 set
    public void setJudgeStandard(String judgeStandard){
        this.judgeStandard = judgeStandard;
    }
    //抽样环节 get
    public String getSampleLink(){
        return sampleLink;
    }
    //抽样环节 set
    public void setSampleLink(String sampleLink){
        this.sampleLink = sampleLink;
    }
    //检测对象 get
    public String getCheckObject(){
        return checkObject;
    }
    //检测对象 set
    public void setCheckObject(String checkObject){
        this.checkObject = checkObject;
    }
    //检测项目 get
    public String getCheckProject(){
        return checkProject;
    }
    //检测项目 set
    public void setCheckProject(String checkProject){
        this.checkProject = checkProject;
    }

    public String getModelTitle() {
        return modelTitle;
    }

    public void setModelTitle(String modelTitle) {
        this.modelTitle = modelTitle;
    }

    public int getRn() {
        return rn;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }

    public String getTaskSource() {
        return taskSource;
    }

    public void setTaskSource(String taskSource) {
        this.taskSource = taskSource;
    }

    public String getTask_ids() {
        return task_ids;
    }

    public void setTask_ids(String task_ids) {
        this.task_ids = task_ids;
    }

    public void setLeve(String leve){
        this.leve = leve;
    }

    public String getLeve(){
        return leve;
    }

    public void setAttachmentAddress(String attachmentAddress){
        this.attachmentAddress = attachmentAddress;
    }

    public String getAttachmentAddress(){
        return attachmentAddress;
    }

    public void setAbolish(String abolish){
        this.abolish = abolish;
    }

    public String getAbolish(){
        return abolish;
    }

    public void setOrganId(String organId){
        this.organId = organId;
    }

    public String getOrganId(){
        return organId;
    }

    public void setSupId(String supId){
        this.supId = supId;
    }

    public String getSupId(){
        return supId;
    }

    //行业id get
    public String getIndustryId(){
        return industryId;
    }
    //行业id set
    public void setIndustryId(String industryId){
        this.industryId = industryId;
    }

    //排除监测类型 get
    public String getMonitorType(){
        return monitorType;
    }
    //排除监测类型 set
    public void setMonitorType(String monitorType){
        this.monitorType = monitorType;
    }

    public String getIs_history() {
        return is_history;
    }

    public void setIs_history(String is_history) {
        this.is_history = is_history;
    }

    public String getCreateOrgRegionId() {
        return createOrgRegionId;
    }

    public void setCreateOrgRegionId(String createOrgRegionId) {
        this.createOrgRegionId = createOrgRegionId;
    }

    public String getLevelEnum() {
        return levelEnum;
    }

    public void setLevelEnum(String levelEnum) {
        this.levelEnum = levelEnum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskName=").append(taskName);
        sb.append(", monitorClass=").append(monitorClass);
        sb.append(", releaseUnit=").append(releaseUnit);
        sb.append(", checkModel=").append(checkModel);
        sb.append(", year=").append(year);
        sb.append(", batch=").append(batch);
        sb.append(", separation=").append(separation);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", deadline=").append(deadline);
        sb.append(", attachment=").append(attachment);
        sb.append(", attachmentcode=").append(attachmentcode);
        sb.append(", comment=").append(comment);
        sb.append(", publishStatus=").append(publishStatus);
        sb.append(", industry=").append(industry);
        sb.append(", industryId=").append(industryId);
        sb.append(", judgeStandard=").append(judgeStandard);
        sb.append(", sampleLink=").append(sampleLink);
        sb.append(", checkObject=").append(checkObject);
        sb.append(", checkProject=").append(checkProject);
        sb.append("]");
        return sb.toString();
    }


    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AdsMonitorTask other = (AdsMonitorTask) that;
        return
                (this.getTaskName() == null ? other.getTaskName() == null : this.getTaskName().equals(other.getTaskName())) &&
                        (this.getMonitorClass() == null ? other.getMonitorClass() == null : this.getMonitorClass().equals(other.getMonitorClass())) &&
                        (this.getReleaseUnit() == null ? other.getReleaseUnit() == null : this.getReleaseUnit().equals(other.getReleaseUnit())) &&
                        (this.getCheckModel() == null ? other.getCheckModel() == null : this.getCheckModel().equals(other.getCheckModel())) &&
                        (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear())) &&
                        (this.getBatch() == null ? other.getBatch() == null : this.getBatch().equals(other.getBatch())) &&
                        (this.getSeparation() == null ? other.getSeparation() == null : this.getSeparation().equals(other.getSeparation())) &&
                        (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime())) &&
                        (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime())) &&
                        (this.getDeadline() == null ? other.getDeadline() == null : this.getDeadline().equals(other.getDeadline())) &&
                        (this.getAttachment() == null ? other.getAttachment() == null : this.getAttachment().equals(other.getAttachment())) &&
                        (this.getAttachmentcode() == null ? other.getAttachmentcode() == null : this.getAttachmentcode().equals(other.getAttachmentcode())) &&
                        (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment())) &&
                        (this.getPublishStatus() == null ? other.getPublishStatus() == null : this.getPublishStatus().equals(other.getPublishStatus())) &&
                        (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry())) &&
                        (this.getJudgeStandard() == null ? other.getJudgeStandard() == null : this.getJudgeStandard().equals(other.getJudgeStandard())) &&
                        (this.getSampleLink() == null ? other.getSampleLink() == null : this.getSampleLink().equals(other.getSampleLink())) &&
                        (this.getCheckObject() == null ? other.getCheckObject() == null : this.getCheckObject().equals(other.getCheckObject())) &&
                        (this.getCheckProject() == null ? other.getCheckProject() == null : this.getCheckProject().equals(other.getCheckProject())) &&
                        (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        result = prime * result + ((getMonitorClass() == null) ? 0 : getMonitorClass().hashCode());
        result = prime * result + ((getReleaseUnit() == null) ? 0 : getReleaseUnit().hashCode());
        result = prime * result + ((getCheckModel() == null) ? 0 : getCheckModel().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getBatch() == null) ? 0 : getBatch().hashCode());
        result = prime * result + ((getSeparation() == null) ? 0 : getSeparation().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        result = prime * result + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        result = prime * result + ((getAttachmentcode() == null) ? 0 : getAttachmentcode().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getJudgeStandard() == null) ? 0 : getJudgeStandard().hashCode());
        result = prime * result + ((getSampleLink() == null) ? 0 : getSampleLink().hashCode());
        result = prime * result + ((getCheckObject() == null) ? 0 : getCheckObject().hashCode());
        result = prime * result + ((getCheckProject() == null) ? 0 : getCheckProject().hashCode());
        return result;
    }

}