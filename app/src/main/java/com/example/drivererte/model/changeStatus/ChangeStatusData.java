package com.example.drivererte.model.changeStatus;

import com.google.gson.annotations.SerializedName;

public class ChangeStatusData {

	@SerializedName("id_users_feeder")
	private String idUsersFeeder;

	@SerializedName("no_hp")
	private Object noHp;

	@SerializedName("detail_tujuan")
	private String detailTujuan;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id_seat")
	private String idSeat;

	@SerializedName("id_trip")
	private String idTrip;

	@SerializedName("nama_penumpang")
	private String namaPenumpang;

	@SerializedName("detail_asal")
	private String detailAsal;

	@SerializedName("biaya_tambahan")
	private Object biayaTambahan;

	@SerializedName("id_pesanan")
	private String idPesanan;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("jenis_kelamin")
	private String jenisKelamin;

	@SerializedName("id_detail_pesanan")
	private int idDetailPesanan;

	@SerializedName("status")
	private int status;

	public void setIdUsersFeeder(String idUsersFeeder){
		this.idUsersFeeder = idUsersFeeder;
	}

	public String getIdUsersFeeder(){
		return idUsersFeeder;
	}

	public void setNoHp(Object noHp){
		this.noHp = noHp;
	}

	public Object getNoHp(){
		return noHp;
	}

	public void setDetailTujuan(String detailTujuan){
		this.detailTujuan = detailTujuan;
	}

	public String getDetailTujuan(){
		return detailTujuan;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setIdSeat(String idSeat){
		this.idSeat = idSeat;
	}

	public String getIdSeat(){
		return idSeat;
	}

	public void setIdTrip(String idTrip){
		this.idTrip = idTrip;
	}

	public String getIdTrip(){
		return idTrip;
	}

	public void setNamaPenumpang(String namaPenumpang){
		this.namaPenumpang = namaPenumpang;
	}

	public String getNamaPenumpang(){
		return namaPenumpang;
	}

	public void setDetailAsal(String detailAsal){
		this.detailAsal = detailAsal;
	}

	public String getDetailAsal(){
		return detailAsal;
	}

	public void setBiayaTambahan(Object biayaTambahan){
		this.biayaTambahan = biayaTambahan;
	}

	public Object getBiayaTambahan(){
		return biayaTambahan;
	}

	public void setIdPesanan(String idPesanan){
		this.idPesanan = idPesanan;
	}

	public String getIdPesanan(){
		return idPesanan;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setJenisKelamin(String jenisKelamin){
		this.jenisKelamin = jenisKelamin;
	}

	public String getJenisKelamin(){
		return jenisKelamin;
	}

	public void setIdDetailPesanan(int idDetailPesanan){
		this.idDetailPesanan = idDetailPesanan;
	}

	public int getIdDetailPesanan(){
		return idDetailPesanan;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}
}