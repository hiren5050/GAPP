
    create table ApplicationStatus_Status (
        ApplicationStatus_As_id int4 not null,
        status varchar(255)
    );

    create table Program (
        p_id int4 not null,
        program_name varchar(255),
        departmentId int4 not null,
        primary key (p_id)
    );

    create table additional_info (
        ad_id int4 not null,
        file varchar(255),
        required boolean,
        text varchar(255),
        application_a_id int4,
        department_d_id int4,
        primary key (ad_id)
    );

    create table application_details (
        a_id int4 not null,
        term varchar(255) not null,
        program_id int4,
        student_id int4,
        primary key (a_id)
    );

    create table applicationstatus (
        As_id int4 not null,
        comment varchar(255),
        u_date timestamp,
        application_id int4,
        student_id int4,
        primary key (As_id)
    );

    create table degree_type (
        de_id int4 not null,
        degree_type varchar(255) not null,
        e_date timestamp not null,
        major varchar(255) not null,
        name varchar(255) not null,
        s_date timestamp not null,
        student_id int4,
        primary key (de_id)
    );

    create table deparment (
        d_id int4 not null,
        name varchar(255),
        primary key (d_id)
    );

    create table education_background (
        E_id int4 not null,
        gpa float8,
        gre int4,
        tofel int4,
        transcript varchar(255),
        student_info_s_id int4,
        primary key (E_id)
    );

    create table student_info (
        s_id int4 not null,
        cin int4,
        dob timestamp not null,
        email varchar(255) not null,
        f_name varchar(255) not null,
        gender char(1) not null,
        l_name varchar(255) not null,
        phone varchar(255) not null,
        citizenship varchar(255) not null,
        application_id int4,
        ed_id int4,
        primary key (s_id)
    );

    create table user_info (
        id int4 not null,
        email varchar(255) not null,
        f_name varchar(255) not null,
        l_name varchar(255) not null,
        password varchar(255) not null,
        deparment int4,
        user_information int4,
        primary key (id)
    );

    create table user_type (
        u_id int4 not null,
        user_type varchar(255)
    );

    alter table ApplicationStatus_Status 
        add constraint FK_cwas0b3j2ue3bt6isfovm12v8 
        foreign key (ApplicationStatus_As_id) 
        references applicationstatus;

    alter table Program 
        add constraint FK_luaxcdcts8gbj602p31w87v47 
        foreign key (departmentId) 
        references deparment;

    alter table additional_info 
        add constraint FK_r9gm6pstgl0lngacp7590kba5 
        foreign key (application_a_id) 
        references application_details;

    alter table additional_info 
        add constraint FK_9gioujehy332j1fmcr3g53h93 
        foreign key (department_d_id) 
        references deparment;

    alter table application_details 
        add constraint FK_kninvtriidohiy43sfeymab10 
        foreign key (program_id) 
        references Program;

    alter table application_details 
        add constraint FK_ks8yfedk120djlhx4ngn8mwho 
        foreign key (student_id) 
        references student_info;

    alter table applicationstatus 
        add constraint FK_8l7hpmqnhee0i3d4ow7h2smwq 
        foreign key (application_id) 
        references application_details;

    alter table applicationstatus 
        add constraint FK_t31mj2ax8oytlm46yapgvy9mq 
        foreign key (student_id) 
        references student_info;

    alter table degree_type 
        add constraint FK_bgnomnu6j6ogdxf9gry57ayaq 
        foreign key (student_id) 
        references student_info;

    alter table education_background 
        add constraint FK_pj97fvhuo8g5nbtcxmkgttl00 
        foreign key (student_info_s_id) 
        references student_info;

    alter table student_info 
        add constraint FK_ecpx30qxmy7lyogxw8hi7h31g 
        foreign key (application_id) 
        references application_details;

    alter table student_info 
        add constraint FK_jw9hp08755glpsgrcl5omjsh8 
        foreign key (ed_id) 
        references education_background;

    alter table user_info 
        add constraint FK_iss312dikjy7i22l3pmc6rkjf 
        foreign key (deparment) 
        references deparment;

    alter table user_info 
        add constraint FK_c8vcjqf8ug2w3224lswlr7dri 
        foreign key (user_information) 
        references deparment;

    alter table user_type 
        add constraint FK_lgo9efjp54d768d6umqybavss 
        foreign key (u_id) 
        references user_info;

    create sequence hibernate_sequence;
